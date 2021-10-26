package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {


    private List<Integer> heights = new ArrayList<>();


    public void addHeigth(int height) {
        heights.add(height);
    }


    public boolean isHeightsIncreasing() {

        // int counter = 0;

        int a = heights.size();


    /*    for (int i = 1; i < a; i++) {


            if (heights.get(i) > heights.get(i - 1)) {

                counter++;
                return true;
            } else {
                return false;
            }
*/



                for (int i = 1; i < a; i++) {
                    if (heights.get(i) <= heights.get(i - 1))
                        return false;
                }
                return true;
            }




        }






