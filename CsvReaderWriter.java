package ReadCsv;
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
public class CsvReaderWriter {
 public static void main(String[] args) {
  String filePath = ":\\Users\\hp\\eclipse-workspace\\Wiley_core_java\\src\\ReadCsv\\productt.csv";
  
  System.out.println("starting write user.csv file: " + filePath);
  writeCsv(filePath);
  
  System.out.println("starting read user.csv file");
  readCsv(filePath);
 }
 
 public static void writeCsv(String filePath) {
  List<Product> product = new ArrayList<Product>();
  
  //create demo Users
  Product product1 = new Product();
  product1.setProductId(1);
  product1.setMensWear("shirts");
  product1.setWomenWears("tops");
  product1.add(product1);
  
  product1 = new Product();
  product1.setProductId(2);
  product1.setMensWear("Trousers");
  product1.setWomenWears("Jeans");
  product1.add(product1);
  
  product1 = new Product();
  product1.setProductId(3);
  product1.setMensWear("Suits");
  product1.setWomenWears("Sarees");
  Product.add(product1);
  
  FileWriter fileWriter = null;
  try {
   fileWriter = new FileWriter(filePath);
   
   fileWriter.append("Id, First Name, Last Name\n");
   Product[] Products = null;
for(Product u: Products) {
    fileWriter.append(String.valueOf(u.getProductId()));
    fileWriter.append(",");
    fileWriter.append(u.getMensWear());
    fileWriter.append(",");
    fileWriter.append(u.getWomenWears());
    fileWriter.append("\n");
   }
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    fileWriter.flush();
    fileWriter.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 }
 
 public static void readCsv(String filePath) {
  BufferedReader reader = null;
  
  try {
   List<Product> products = new ArrayList<Product>();
   String line = "";
   reader = new BufferedReader(new FileReader(filePath));
   reader.readLine();
   
   while((line = reader.readLine()) != null) {
    String[] fields = line.split(",");
    
    if(fields.length > 0) {
     Product product = new Product();
     product.setProductId(Integer.parseInt(fields[0]));
     product.setMensWear(fields[1]);
     product.setWomenWears(fields[2]);
     products.add(product);
    }
   }
   
   for(Product u: products) {
    System.out.printf("[userProductId=%d, MensWear=%s, WomenWear=%s]\n", u.getProductId(), u.getMensWear(), u.getWomenWears());
   }
   
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    reader.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
  
 }
}
