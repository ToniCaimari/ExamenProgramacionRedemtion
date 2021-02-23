// package edu.pingpong.stockx.criteria;

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.stream.Collectors;

// import edu.pingpong.stockx.item.Item;
// import edu.pingpong.stockx.item.Offer;

// public class Max implements Criteria {
// private Criteria criteria;
// private Criteria otherCriteria;

// public Max(Criteria criteria, Criteria otherCriteria) {
// this.criteria = criteria;
// this.otherCriteria = otherCriteria;
// }

// @Override
// public List<Offer> checkCriteria(Item sneaker) {
// List<Offer> firstCriteria = criteria.checkCriteria(sneaker);
// List<Offer> secondCriteria = otherCriteria.checkCriteria(sneaker);
// List<Offer> andCriteria = new ArrayList<Offer>();

// andCriteria = firstCriteria.stream()
// .filter(x -> (secondCriteria.stream().max(Comparator.
// comparing(Offer::value))))
// .collect(Collectors.toList());
// return andCriteria;
// }

// }
// Necesario usar el compareTo, no soy capaz de momento