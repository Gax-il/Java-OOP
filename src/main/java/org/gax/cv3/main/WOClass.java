package org.gax.cv3.main;

public class WOClass
{
    public static void getPatientById(int id, Object[] patientList){
        String output = "";

        for(Object obj:patientList){
            if(obj instanceof String[]){
                Object[] array = (Object[]) obj;

                output+=array[id];
            }
            else if(obj instanceof int[]){
                int[] array = (int[]) obj;

                output+= array[id];
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args){

    String[] name = {"Pavel","Josek","Karel"};
    String[] surname = {"Novak","Dvoresky","Maly"};
    int[] year = {1888, 1200, 1233};

    Object[] patientList = new Object[3];
    patientList[0] = name;
    patientList[1] = surname;
    patientList[2] = year;

    getPatientById(1, patientList);



    }


}
