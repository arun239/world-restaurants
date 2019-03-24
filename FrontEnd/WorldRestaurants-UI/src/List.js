import React from 'react';
import Item from './Item';
import {baseURL, sortByOptions, cuisines, serialize} from './data.js';

const axios = require('axios');

export default class List extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      name: '',
      cuisine: '',
      column: 'cost',
      order: 'ASC',
      items: []
    }

    this.handleChange = this.handleChange.bind(this);
    this.handleSort = this.handleSort.bind(this);
    this.fetchItems = this.fetchItems.bind(this);
  }

  componentDidMount() {
    this.fetchItems();
  }

  fetchItems() {
    const {name, cuisine, column, order} = this.state;
    let url = `${baseURL}/restaurants?pageNumber=0&pageSize=100`;
    
    let queryParams = {
      restaurantName: name,
      cuisines: cuisine,
      sortBy: column,
      order: order
    }
    let queryUrl = serialize(queryParams);
    
    axios({
      method: 'get',
      url: url+'&'+queryUrl,
      headers: {
        "auth-token": "RANDOM123"
      }
    }).then(resp => {
      console.log('resp ::',resp);
      this.setState({
        items: resp.data.content
      })
    }).catch(resp => {
      console.error('resp ::',resp);
    });
  }

  handleChange(e) {
    let newState = Object.assign({}, this.state);
    newState[e.target.name] = e.target.value;
    this.setState(newState);
    this.fetchItems();
  }

  handleSort(e) {
    let newState = Object.assign({}, this.state);

    for (let index = 0; index < sortByOptions.length; index++) {
      let option = sortByOptions[index];
      if (option.value === e.target.value) {
        newState.column = option.column;
        newState.order = option.order;
        break;
      }
    }
    
    this.setState(newState);
    this.fetchItems();
  }

  render() {
    const {items, name, cuisine, column, order} = this.state;
    const sortValue = `${column}-${order}`;

    return(
      <div>
        <div className="header-container">
          <div className="main-header">
            <div className="logo-container"></div>
            <div className="search-container">
              <input className="search-box" type="text" name="name" onChange={this.handleChange} value={name} placeholder="Search Restaurants"/>
            </div>
            <div className="actions-container"></div>
          </div>
          <div className="secondary-header">
            <div className="header-field">
              <span>Filter Cuisine </span>
              <select name="cuisine" value={cuisine} onChange={this.handleChange}>
                {cuisines.map(opt => (
                  <option value={opt} key={opt}>{opt}</option>
                ))}
              </select>
            </div>
            <div className="header-field">
              <span>Sort </span>
              <select name="sortBy" value={sortValue} onChange={this.handleSort} >
                {sortByOptions.map(opt => (
                  <option value={opt.value} key={opt.value}>{opt.label}</option>
                ))}
              </select>
            </div>
          </div>
        </div>
        <div className="list-container">
          <div>
            {items.map(item => <Item item={item} key={item.id}/>)}
          </div>
        </div>
      </div>
    )
  }
}