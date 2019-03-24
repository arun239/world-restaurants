export const baseURL = "http://localhost:8080";

export const ratingColors = {
  "Green": "green",
  "Dark Green": "darkgreen",
  "Orange": "orange",
  "Yellow": "yellow"
}

export const sortByOptions = [
  {
    value: "rating-DESC",
    label: "Rating - High to low",
    column: "aggregate_rating",
    order: "DESC"
  },
  {
    value: "rating-ASC",
    label: "Rating - Low to high",
    column: "aggregate_rating",
    order: "ASC"
  },
  {
    value: "cost-DESC",
    label: "Cost - High to low",
    column: "cost",
    order: "DESC"
  },
  {
    value: "cost-ASC",
    label: "Cost - Low to high",
    column: "cost",
    order: "ASC"
  }
]

export const cuisines = [
  "",
  "French",
  "Japanese",
  "Desserts",
  "Seafood",
  "Asian",
  "Filipino",
  "Indian",
  "Sushi",
  "Fast Food",
  "BBQ"
];

export const serialize = function(obj, prefix) {
  var str = [],
    p;
  for (p in obj) {
    if (obj.hasOwnProperty(p)) {
      var k = prefix ? prefix + "[" + p + "]" : p,
        v = obj[p];
      str.push((v !== null && typeof v === "object") ?
        serialize(v, k) :
        encodeURIComponent(k) + "=" + encodeURIComponent(v));
    }
  }
  return str.join("&");
}

