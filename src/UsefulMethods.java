public class UsefulMethods {

//    public static Movie[] addMovie(Movie newMovie, Movie[] movies){
//        Movie[] varA;
//        varA = new Movie[movies.length+1];
//        for (int i = 0; i < movies.length; i++){
//            varA[i] = movies[i];
//        }
//        varA[varA.length-1] = newMovie;
//
//        return varA;
//    }

    public static Class[] addToArrayMethod(Class newObject, Class[] oldArray) {
        // Declare a new array variable
        Class[] newArrayVariable;

        // Make the new array = the oldArray's length w/ the class' data type
        newArrayVariable = new Class[oldArray.length+1];

        // loop through
        for (int i = 0; i < oldArray.length; i++) {
            // Assign each element & index of the new as the old array's value
            newArrayVariable[i] = oldArray[i];
        }
        newArrayVariable[newArrayVariable.length-1] = newObject;
        return newArrayVariable;
    }



}
