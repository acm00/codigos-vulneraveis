package teste;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TesteAlgoritmo {

         public static void main(String args []) throws NoSuchAlgorithmException,
         UnsupportedEncodingException {

                   String senha = "admin";

                   MessageDigest algorithm = MessageDigest.getInstance("MD5");
                   byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

                   System.out.println(messageDigest);
         }

}
