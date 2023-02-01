package company.a_31_ezetap;
import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] argh) throws IOException {

        File file = new File(
                "/home/nobroker/Documents/interviews/interviews50-50/src/main/java/company/ezetap/test-input-01.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        StringBuilder sb = new StringBuilder();
        while ((st= br.readLine()) != null)
           sb.append(st).append("\n");
        Solution obj = new Solution();
        System.out.println(obj.solution(sb.toString()));

    }
    public String solution(String s) {

        List<Photo> photos = new ArrayList<>();
        Map<String, ArrayList<Photo>> myMap = new HashMap<>();
        List<String> listOfPhoto = new ArrayList<>();
        StringBuilder updatedName = new StringBuilder();

        StringTokenizer str = new StringTokenizer(s, "\n");

        while (str.hasMoreTokens()) {
            listOfPhoto.add(str.nextToken());
        }

        for (String each : listOfPhoto) {
            StringTokenizer token = new StringTokenizer(each, ",");
            Photo photo = new Photo(token.nextToken().replace(" ", ""), token.nextToken().replace(" ", ""), token.nextToken().replace(" ", ""));
            photos.add(photo);
        }

        for (Photo pic : photos) {
            String myPlace = pic.getCity();
            if (myMap.get(myPlace) != null) {
                myMap.get(myPlace).add(pic);

            } else {
                ArrayList<Photo> pics = new ArrayList<>();
                pics.add(pic);
                myMap.put(myPlace, pics);
            }
        }
        for (Photo p : photos) {
            ArrayList<Photo> myLisSort = myMap.get(p.getCity());
            Collections.sort(myLisSort);
            int counter = myLisSort.indexOf(p) + 1;
            updatedName.append(p.getCity()).append(((getZeros(String.valueOf(myMap.get(p.getCity()).size()).length()))
                    + counter).substring(String.valueOf(counter).length())).append(p.getName().substring(p.getName().indexOf("."))).append("\n");
        }
        return updatedName.toString();
    }

    public static String getZeros(int counter) {
        StringBuilder str = new StringBuilder();

        for (int z = 0; z < counter; z++) {
            str.append("0");
        }
        return str.toString();
    }
    public static class Photo implements Comparable<Photo>{

        String name;
        String city;
        String time;


        public Photo(String name, String city, String time) {
            this.name = name;
            this.city = city;
            this.time = time;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public String getTime() {
            return time;
        }


        @Override
        public int compareTo(Photo o) {
            return this.getTime().compareTo(o.getTime());
        }

    }
}


