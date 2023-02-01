//package company.a_31_ezetap;
//
//
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Arc {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String phone = sc.nextLine();
//        System.out.println(printPhone(name, phone));
//    }
//
//    private static String printPhone(String name, String phone) {
//        String code = apiResponseParser(name);
//        if(code=="-1") return "-1";
//        return "+"+code+" "+ phone;
//    }
//
//    public static String apiResponseParser(String countryName) {
//        countryName = countryName.replaceAll("\\s","%20");
//        String strUrl = "https://jsonmock.hackerrank.com/api/countries?name=" + countryName;
//        String str = "";
//        Gson gson = new Gson();
//        Response contacts = null;
//        try {
//            URL url = new URL(strUrl);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            httpURLConnection.setRequestMethod("GET");
//            httpURLConnection.connect();
//
//            InputStreamReader ir = new InputStreamReader(httpURLConnection.getInputStream());
//
//            contacts = gson.fromJson(ir, new TypeToken<Response>() {
//            }.getType());
//
//
//        } catch (ProtocolException e) {
//            throw new RuntimeException(e);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//       List<Country> result= contacts.getData();
//        if(result==null || result.size()==0) return "-1";
//        List<String> codes = result.get(0).getCallingCodes();
//        return codes.get(codes.size()-1);
//
//    }
//}
