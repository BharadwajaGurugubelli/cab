package com.bharadwaja.cabbooking.strategies;

import com.bharadwaja.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
