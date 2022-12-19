package chapter13;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (Exception exception){
            System.out.println("file is not exist");
            exception.printStackTrace();
        }
    }

    public static void createNewFileRethrow () throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/nonexistent.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } // enhanced way to write more than one exception
        catch (FileNotFoundException | InputMismatchException  e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }


}
