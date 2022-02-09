package com.bharadwaja.cabbooking.strategies;

import com.bharadwaja.cabbooking.model.Cab;
import com.bharadwaja.cabbooking.model.Location;
import com.bharadwaja.cabbooking.model.Rider;
import java.util.List;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
