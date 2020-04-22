////1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен
////вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней
//// четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить
//// RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//// Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//// 2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//// то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//
//public class Metods {
//
//    public static void main(String[] args) {
//        System.out.println("Задание первое:");
//        int[] mass= {1, 2, 4, 4, 2, 3, 4, 1, 7};
//        printMass(cutFour(mass));
//
//        System.out.println("\nВторое задание:");
//        int[] massD = {1, 1, 1, 4, 1, 1, 1, 4};
//        int[] massD1 = {1, 1, 1, 1, 1, 1};
//        int[] massD2 = {4, 4, 4};
//        int[] massD3 = {1, 3, 1, 4, 1, 1, 1, 4};
//        int[] massD4 = {1, 3, 1, 4, 5, 1, 1, 4};
//        System.out.println(avail(massD));
//        System.out.println(avail(massD1));
//        System.out.println(avail(massD2));
//        System.out.println(avail(massD3));
//        System.out.println(avail(massD4));
//    }
//
//    public static boolean avail(int[] mass){
//        int count1=0;
//        int count4=0;
//        for(int i=0; i<mass.length; i++){
//            if (mass[i]==1) {
//                count1++;
//            }else if (mass[i]==4){
//                count4++;
//            }
//        }
//        return mass.length==(count1+count4)&&count1>0&&count4>0;
//    }
//
//    public static int[] cutFour(int[] mass){//подрезка массива (наворочено но работает)
//        int count=0;
//        for(int i = mass.length-1; i>=0;i--){
//            if(mass[i]!=4){
//                count++;
//            }else{
//                break;
//            }
//        }
//        //System.out.println(count);
//        if((count)==mass.length){
//            System.out.println("В массиве нет четверок");
//            return mass;
//        }
//        if(mass[mass.length-1]==4){
//            System.out.println("В массиве последний элемент равен 4, поэтому во второй массив нечего положить.");
//            return mass;
//        }
//        else{
//            int[] massc = new int[count];
//            int j=0;
//            for(int i = mass.length-count; i<mass.length; i++){
//                massc[j] = mass[i];
//                j++;
//            }
//            return massc;
//        }
//    }
//
//    public static void printMass(int[] massp){//удобоваримый вид массива при выводе
//        for(int i=0; i<massp.length;i++){
//            System.out.print(massp[i]+" ");
//        }
//    }
//}
