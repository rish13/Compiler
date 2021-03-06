package ece351.objectcontract;





public final class TestObjectContract extends TestObjectContractBase {

	/**
	 * Construct an object who's equals method always returns false.
	 */
	@Override
	Object constructAlwaysFalse() {
		// this is an anonymous inner class that is a subclass of Object
		return new Object() {
			public boolean equals(Object ob) { 
// TODO: 1 lines snipped
				return false;
//throw new ece351.util.Todo351Exception();
			}
		};
	}
	
	/**
	 * Construct an object who's equals method always returns true.
	 */
	@Override
	Object constructAlwaysTrue() {
		// this is an anonymous inner class that is a subclass of Object
		return new Object() {
			public boolean equals(Object ob) { 
// TODO: 1 lines snipped
				return true;
//throw new ece351.util.Todo351Exception();
			}
		};
	}
	
	/**
	 * Construct an object who's equals method alternates between returning true and false.
	 */
	@Override
	Object constructToggler() {
		// this is an anonymous inner class that is a subclass of Object
		return new Object() {
			private boolean flag = true;
			public boolean equals(Object ob) { 
// TODO: 2 lines snipped
				flag = !flag;
				return flag;
//throw new ece351.util.Todo351Exception();
			}
		};
	}
	
	/**
	 * Construct two SymmetryBreaker objects to show that symmetry of equality is violated.
	 */
	@Override
	SymmetryBreaker[] constructSymmetryBreakers() {
		final SymmetryBreaker[] result = new SymmetryBreaker[2];
// TODO: 3 lines snipped
		result[0] = new SymmetryBreaker(1, null);
		result[1] = new SymmetryBreaker(1, result[0]);
		return result;
//throw new ece351.util.Todo351Exception();
	}

	
	/**
	 * Construct three TransitivityBreaker objects to show that transitivity of equality is violated.
	 */
	@Override
	TransitivityBreaker[] constructTransitivityBreakers() {
		final double epsilon6 = TestObjectContractBase.TransitivityBreaker.epsilon * 0.6d;
		final TransitivityBreaker[] result = new TransitivityBreaker[3];
// TODO: 4 lines snipped
		result[0] = new TransitivityBreaker(0.0d);
		result[1] = new TransitivityBreaker(0.0d + epsilon6);
		result[2] = new TransitivityBreaker(0.0d + epsilon6 + epsilon6);
		return result;
//throw new ece351.util.Todo351Exception();
	}

	/**
	 * Construct two objects that violate consistency of equals and hashcode.
	 * (In other words, two objects that are equals but have different hashcodes.)
	 * Hint: you can use some of the simple control objects if you understand
	 * what the default hashcode() implementation in Java is.
	 */
	@Override
	Object[] constructHashcodeConsistencyViolators() {
		final Object[] result = new Object[2];
// TODO: 3 lines snipped
		result[0] = constructAlwaysTrue();
		result[1] = constructAlwaysTrue();
		return result;
//throw new ece351.util.Todo351Exception();
	}

	/**
	 * Returns false if obj.equals(null) is true.
	 * @param obj
	 */
	@Override
	boolean checkNotEqualsNull(final Object obj) {
// TODO: 1 line snipped
		return !obj.equals(null);
//throw new ece351.util.Todo351Exception();
	}

	/**
	 * Returns true if obj.equals(obj) is true.
	 * @param obj
	 */
	@Override
	boolean checkEqualsIsReflexive(final Object obj) {
// TODO: 1 line snipped
		return obj.equals(obj);
//throw new ece351.util.Todo351Exception();
	}

	/**
	 * Returns true if both are equals, or if both are not equals.
	 * Returns false if one equals the other but not vice versa.
	 * @param o1
	 * @param o2
	 * @return
	 */
	@Override
	boolean checkEqualsIsSymmetric(final Object o1, final Object o2) {
// TODO: 1 line snipped
		return o2.equals(o1) == o1.equals(o2);
//throw new ece351.util.Todo351Exception();
	}

	/**
	 * Returns true if all three objects are equals to each other.
	 * This isn't the most complete test of transitivity, but it will do.
	 * @param o1
	 * @param o2
	 * @param o3
	 */
	@Override
	boolean checkEqualsIsTransitive(final Object o1, final Object o2, final Object o3) {
// TODO: 1 line snipped
		return o1.equals(o2) && o1.equals(o3) && o2.equals(o3);
//throw new ece351.util.Todo351Exception();
	}

	@Override
	boolean checkHashcodeIsConsistent(final Object o1, final Object o2) {
// TODO: 5 lines snipped
		if(o1.equals(o2))
		{
			return o1.hashCode() == o2.hashCode();
		}
		else
		{
			return true;
		}
//throw new ece351.util.Todo351Exception();
	}
}
