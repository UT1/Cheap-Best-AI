import java.io.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Query extends Application
{
String query="";
public static void main(String [] args)throws IOException
{
  launch (args);
}
public void start(Stage ms)throws Exception
{

  ms.setTitle("Query Segmentation");
BorderPane root=new BorderPane();
Image im=new Image("wally.jpg");
ImageView iv=new ImageView();
iv.setImage(im);
iv.setFitWidth(800);
iv.setFitHeight(100);
iv.setPreserveRatio(false);

root.setTop(iv);
root.setAlignment(iv,Pos.CENTER);

VBox flow=new VBox(5);
     Label s=new Label("*****Please Select Smartphone Brand*****");
     CheckBox cb1=new CheckBox("Samsung");
     CheckBox cb2=new CheckBox("Nokia");
     CheckBox cb3=new CheckBox("Jethro");
     CheckBox cb4=new CheckBox("e passion");
     CheckBox cb6=new CheckBox("Cedar Tree");
     CheckBox cb7=new CheckBox("Indigi");
     CheckBox cb8=new CheckBox("Phone Baby");

     CheckBox cb10=new CheckBox("Huawei");
     CheckBox cb11=new CheckBox("Juning");
     CheckBox cb12=new CheckBox("Elephone");
     CheckBox cb13=new CheckBox("Plum");
     CheckBox cb14=new CheckBox("Lenovo");

     CheckBox cb16=new CheckBox("Ulefone");
     CheckBox cb17=new CheckBox("Jiuhe");
     CheckBox cb18=new CheckBox("Acer");
     CheckBox cb19=new CheckBox("AKUA");

     CheckBox cb21=new CheckBox("Odysseus");
     CheckBox cb22=new CheckBox("Blackberry");
     CheckBox cb23=new CheckBox("Star");
     CheckBox cb24=new CheckBox("Apple");
     VBox submenu=new VBox(2);

     flow.getChildren().addAll(s,cb1,cb2,cb3,cb4,cb6,cb7,cb8,cb10,cb11,cb12,cb13,cb14,cb16,cb17,cb18,cb19,cb21,cb22,cb23,cb24);
     root.setCenter(flow);
     cb1.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Samsung ";
      CheckBox cb1_1=new CheckBox("Front camera");
      CheckBox cb1_2=new CheckBox("Android");
      CheckBox cb1_3=new CheckBox("Slider");
      CheckBox cb1_4=new CheckBox("QWERTY Keyboard");
      CheckBox cb1_5=new CheckBox("TouchScreen");
      submenu.getChildren().addAll(cb1_1,cb1_2,cb1_3,cb1_4,cb1_5);
      }
     });

     cb2.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Nokia ";
      CheckBox cb2_1=new CheckBox("GSM");
      CheckBox cb2_2=new CheckBox("Wifi");
      CheckBox cb2_3=new CheckBox("Bluetooth");
      CheckBox cb2_4=new CheckBox("MicroSD");
      CheckBox cb2_5=new CheckBox("Radio");
      submenu.getChildren().addAll(cb2_1,cb2_2,cb2_3,cb2_4,cb2_5);
      }
     });

     cb3.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Jethro ";
      CheckBox cb3_1=new CheckBox("Kids Cellphone");
      CheckBox cb3_3=new CheckBox("Large LCD");
      CheckBox cb3_2=new CheckBox("GSM");
      CheckBox cb3_4=new CheckBox("Large Keypad");
      CheckBox cb3_5=new CheckBox("Quadband");
      submenu.getChildren().addAll(cb3_1,cb3_2,cb3_3,cb3_4,cb3_5);
      }
     });

     cb4.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="E Passion ";
      CheckBox cb4_1=new CheckBox("Phablet");
      CheckBox cb4_2=new CheckBox("WCDMA");
      CheckBox cb4_3=new CheckBox("Dual Sim");
      CheckBox cb4_4=new CheckBox("QuadCore");
      CheckBox cb4_5=new CheckBox("3G");
      submenu.getChildren().addAll(cb4_1,cb4_2,cb4_3,cb4_4,cb4_5);
      }
      });

     cb6.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Cedar Tree ";
      CheckBox cb6_1=new CheckBox("Micro Android");
      CheckBox cb6_2=new CheckBox("Wifi");
      CheckBox cb6_3=new CheckBox("Bluetooth");
      submenu.getChildren().addAll(cb6_1,cb6_2,cb6_3);
      }
     });

     cb7.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Indigi ";
      CheckBox cb7_1=new CheckBox("6 Inch");
      CheckBox cb7_2=new CheckBox("QHD");
      CheckBox cb7_3=new CheckBox("Android 5.1");
      submenu.getChildren().addAll(cb7_1,cb7_2,cb7_3);
      }
     });

     cb8.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Phone Baby ";
      CheckBox cb8_1=new CheckBox("Kid's Phone");
      submenu.getChildren().addAll(cb8_1);
      }

     });



     cb10.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Huawei ";
      CheckBox cb10_1=new CheckBox("Ram 3GB");
      CheckBox cb10_2=new CheckBox("16GB hard disk");
      CheckBox cb10_3=new CheckBox("5.5 inch screen");
      CheckBox cb10_4=new CheckBox("Android 4.4");
      submenu.getChildren().addAll(cb10_1,cb10_2,cb10_3,cb10_4);
      }
      });

     cb11.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Juning ";
      CheckBox cb11_1=new CheckBox("5.5 inch");
      CheckBox cb11_2=new CheckBox("Android 5.1");
      CheckBox cb11_3=new CheckBox("5 MP camera");
      submenu.getChildren().addAll(cb11_1,cb11_2,cb11_3);
        }
     });

     cb12.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Elephone ";
      CheckBox cb12_3=new CheckBox("Quad Core");
      CheckBox cb12_2=new CheckBox("2 GB Ram");
      CheckBox cb12_1=new CheckBox("16 GB Hard Disk");
      submenu.getChildren().addAll(cb12_1,cb12_2,cb12_3);
      }
     });

     cb13.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Plum ";
      CheckBox cb13_1=new CheckBox("5.5 Inch HD");
      CheckBox cb13_2=new CheckBox("GSM");
      CheckBox cb13_3=new CheckBox("4G");
      submenu.getChildren().addAll(cb13_1,cb13_2,cb13_3);
      }
     });

     cb14.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Lenovo ";
      CheckBox cb14_1=new CheckBox("3G");
      CheckBox cb14_2=new CheckBox("4GB Ram");
      CheckBox cb14_3=new CheckBox("Android 4.2");
      submenu.getChildren().addAll(cb14_1,cb14_2,cb14_3);
      }
     });



     cb16.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Ulephone ";
      CheckBox cb16_1=new CheckBox("XPRESS Music");
      CheckBox cb16_2=new CheckBox("Games");
      submenu.getChildren().addAll(cb16_1,cb16_2);
      }
     });

     cb17.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Jiuha ";
      CheckBox cb17_1=new CheckBox("6 Inch");
      CheckBox cb17_2=new CheckBox("512 Mb Ram");
      submenu.getChildren().addAll(cb17_1,cb17_2);
      }
     });

     cb18.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Acer ";
      CheckBox cb18_1=new CheckBox("Dual Sim");
      CheckBox cb18_2=new CheckBox("Android KitKat");
      CheckBox cb18_3=new CheckBox("5 Inch");
      submenu.getChildren().addAll(cb18_1,cb18_2,cb18_3);
      }
     });

     cb19.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="AKUA ";
      CheckBox cb19_1=new CheckBox("4 Inch");
      CheckBox cb19_2=new CheckBox("GSM");
      submenu.getChildren().addAll(cb19_1,cb19_2);
      }
     });

     cb21.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Odysseus ";
      CheckBox cb20_1=new CheckBox("5 Inch");
      CheckBox cb20_2=new CheckBox("Quad Core");
      CheckBox cb20_3=new CheckBox("13 MP Camera");
      submenu.getChildren().addAll(cb20_1,cb20_2,cb20_3);
      }
     });

     cb22.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Blackberry";
      CheckBox cb21_1=new CheckBox("7.1 Blackberry OS");
      CheckBox cb21_2=new CheckBox("2 MP Camera");
      submenu.getChildren().addAll(cb21_1,cb21_2);

      }
     });

     cb23.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Star ";
      CheckBox cb22_1=new CheckBox("IPS Touch");
      CheckBox cb22_2=new CheckBox("GPS");
      submenu.getChildren().addAll(cb22_1,cb22_2);
      }
     });

     cb24.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{query+="Apple ";
      CheckBox cb23_1=new CheckBox("IPhone 5C");
      CheckBox cb23_2=new CheckBox("IPhone 5S");
      CheckBox cb23_3=new CheckBox("IPad Pro");
      CheckBox cb23_4=new CheckBox("Iphone 2G");
      CheckBox cb23_5=new CheckBox("Iphone 3G");
      CheckBox cb23_6=new CheckBox("Iphone 3GS");
      CheckBox cb23_7=new CheckBox("Iphone 4");
      CheckBox cb23_8=new CheckBox("Iphone 6");
      submenu.getChildren().addAll(cb23_1,cb23_2,cb23_3,cb23_4,cb23_5,cb23_6,cb23_7,cb23_8);
      }
     });

     TextField t=new TextField("#####");
     HBox hb=new HBox(5);
     Button pr=new Button("GO");
     Button can=new Button("Cancel");
     Button pre=new Button("Next");
     pre.setOnAction(
     	new EventHandler<ActionEvent>()
     	{
     	public void handle(ActionEvent e)
     	{
        t.setText("The companies selected are:"+query);
        t.setPrefWidth(800);
        root.setCenter(submenu);
      }
     });
     hb.getChildren().addAll(pr,pre,can,t);
     root.setBottom(hb);

  Scene sc=new Scene(root,400,800);
  ms.setScene(sc);
  ms.show();
}
}