import React from 'react';
import ReactDOM from 'react-dom';
import List from './List';
const title = 'My Minimal React Webpack Babel Setup';

ReactDOM.render(
  <div><List /></div>,
  document.getElementById('app')
);

module.hot.accept();