import React from 'react';
import {ratingColors} from './data.js';

export default class Item extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    const {item} = this.props;
    return(
      <div className="item-container">
        <div className="item-left">
          <img src="https://i.imgur.com/QXxZN3L.jpg" />
        </div>
        <div className="item-middle">
          <div className="item-title">
            {item.name}
          </div>
          <div className="item-details">
              <span>{item.cuisines} | </span> 
              <strong>₹{item.cost} for two</strong>
            </div>
        </div>
        <div className="item-right">
          <div className={`item-rating ${ratingColors[item.ratingColor]}`}>
            <p className="rating-num">{item.aggregateRating}</p>
            <span>{item.ratingText}</span>
          </div>
          <div className="item-votes">
            {item.votes} <small>votes</small>
          </div>
        </div>
      </div>
    )
  }
}