public class CompareArrays {
    public static <J> boolean compareArrays(J[] j1, J[] j2){
        if (j1.length == j2.length){
            for (int i = 0; i < j1.length; i++) {
                if (j1[i].getClass() != j2[i].getClass()){
                    return false;
                }

            }
            return true;
        }
        return false;
    }
}
