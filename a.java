public class a {

    double area(Shape shape) {
	    return switch (shape) {
		    case Circle circle -> // [...]
		    case Rectangle rect ->  // [...]
		    case null -> Double.Nan;
		    default -> Double.Nan;
	    };
}

}
