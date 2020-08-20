//package exercises;
//
//import java.util.ArrayList;
//
//public class ArrayListAdder {
//
//    public static ArrayList<Integer> sumArrayLists(ArrayList<Integer> first, ArrayList<Integer> second){
//        //make an array list to hold the result
//        ArrayList<Integer> result = new ArrayList<>();
//
//        //check the lengths of the arrayLists, figure out which is longer
//        if(int i = 0; i < first.size(); i++) {
//            //for each element in the longer arrayList
//            for(Integer value : first) {
//                //if I haven't run out of ints from the shorter list
//                if(i < second.size()) {
//                    //add the two ints together
//                   Integer sum = first.get(i) + second.get(i);
//                   result.add(sum);
//                } else{
//                    //just keep the value from the longer list
//                }
//
//
//            }
//            return result;
//
//            //return the result
//        }
//
//    }
//    public static void main (String[] args) {
//        ArrayList<Integer> first = new ArrayList<>();
//        first.add(3);
//        first.add(4);
//        first.add(5);
//        first.add(1);
//
//        ArrayList<Integer> second = new ArrayList<>();
//        second.add(1);
//        second.add(6);
//
//                result = sumArrayLists(first, second);
//                System.out
//    }
//}
