package Opg3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4, 1);
        Room room2 = new Room(2, 2);
        Room room3 = new Room(1, 3);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 3);

        //System.out.println(countLampsInBuilding(building)+countRoomsInBuilding(building)+countWindowsInBuilding(building));
        System.out.println("Lamper: "+countLampsInBuilding(building));
        System.out.println("Vinduer: "+countWindowsInBuilding(building));
        System.out.println("Antal rum: "+countRoomsInBuilding(building));

        System.out.println("Flere etager end rum?");
        if(isNormal(building)){
            System.out.println("Ja");
        } else {
            System.out.println("Nej");
        }


        }


        public static int countLampsInBuilding (Building building){
            int lamper = 0;
            for (Room r : building.getRooms()){
                lamper += r.getNumberOfLamps();

            }
            return lamper;
        }
    public static int countWindowsInBuilding (Building building){
        int vinduer = 0;
        for (Room r : building.getRooms()){
            vinduer += r.getNumberOfWindows();

        }
        return vinduer;
    }
    public static int countRoomsInBuilding (Building building){
        return building.getRooms().size();
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() <= building.getRooms().size()) {
            return true;
        } else {
            return false;
        }
    }
    }




