import java.io.*;
import java.math.BigInteger;
//фразы для поиска readreadint, read_readint

 class Task5_4_7 {

    public static class Animal {
        public void met() throws ClassNotFoundException {
            //throw new IOException();
            throw new ClassNotFoundException();
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
        byte[] byte_array = new byte[2];
        byte_array[0] = 127;
        byte_array[1] = 127;
*/

/*
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byte_array))) {
            Animal[] deserializedAnimals = new Animal[ois.read()];
            for (int i = 1; i <= deserializedAnimals.length; i++) {
                deserializedAnimals[i-1] = (Animal) ois.readObject();
            }
            return;
        } catch (ClassNotFoundException | IOException e) {
            throw new IllegalArgumentException();
        }
*/
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        int i =
                //127
                65535
                ;
        oos.writeInt(i); //writes 32 bit int
        //oos.write(i); //write a byte
        //oos.writeByte(i);
        //oos.flush();
        oos.close();
        //PrintStream

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        int var = 1;

        if (var == 1) {
            int res;
            while ((res = ois.read()) != -1) {
                System.out.println(res);
            }
        } else if (var == 2) {
            byte b;
            do {
                b = ois.readByte();
                System.out.println(b);
            } while (true);
        } else if (var == 3) {
            int res;
            do {
                res = ois.readInt();
                System.out.println(res);
            } while (true);
    }



    //i = ois.read();
        //i = ois.readByte();
        //i = ois.readInt();
        //System.out.println(i);
        //System.out.println(ois.readInt());
        //System.out.println(ois.readObject());
        //System.out.println(ois.readObject());
        //System.out.println(byte_array[0]);//System.out.println(byte_array[0]);//System.out.println(byte_array[0]);//System.out.println(byte_array[0]);//System.out.println(byte_array[0]);//System.out.println(byte_array[0]);//System.out.println(byte_array[0]);
    }
}
