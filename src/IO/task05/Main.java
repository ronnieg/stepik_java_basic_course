//package IO.task05;
//
//public class Main {
//    public static Animal[] deserializeAnimalArray(byte[] data) {
//        int countOfAnimals = 0;
//        Animal[] animals = new Animal[0];
//
//        ByteArrayInputStream dataInputStream = new ByteArrayInputStream(data);
//        try {
//            ObjectInputStream ois = new ObjectInputStream(dataInputStream);
//
//            countOfAnimals = ois.readInt();
//            animals = new Animal[countOfAnimals];
//
//            for (int i = 0; i < countOfAnimals; i++) {
//                Animal a = (Animal) ois.readObject();
//                animals[i] = a;
//            }
//
//        } catch (Exception e) {
//            throw new java.lang.IllegalArgumentException();
//        }
//
//        return animals;
//    }
//}
