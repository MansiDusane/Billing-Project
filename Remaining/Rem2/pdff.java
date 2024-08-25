import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javafx.application.Application;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.TextArea;
 import javafx.scene.layout.AnchorPane;
 import javafx.scene.layout.Pane;
 import javafx.scene.layout.StackPane;
 import javafx.stage.Stage;
 import org.apache.pdfbox.pdmodel.PDDocument;
 import org.apache.pdfbox.pdmodel.PDPage;
 import org.apache.pdfbox.pdmodel.PDPageContentStream;
 import org.apache.pdfbox.pdmodel.font.PDFont;
 import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class pdff extends Application {
public void start(Stage primaryStage) {

    TextArea textarea = new TextArea("dsfdskjlajljsflssssssssssssssssss");
    Pane pane = new AnchorPane(textarea);

    textarea.setPrefSize(100, 100);
    Button btn = new Button();
    btn.setText("To pdf");
    btn.setTranslateX(100);
    String text = textarea.getText();
    pane.getChildren().add(btn);

    btn.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            System.out.println(text);

            PDFont font =  PDType1Font.HELVETICA_BOLD ;
             PDDocument doc    = new PDDocument();
             PDPage page = new PDPage();
             PDPageContentStream content;
            try {
                content = new PDPageContentStream(doc, page);
                content.beginText();
			 //  moveTextPositionByAmount(float tx, float ty);//  content.moveTextPosition(100, 700);
                content.setFont(font, 20);

                content.showText(textarea.getText());

               content.endText();
                content.close();
                doc.addPage(page);
                //textarea.setAlignmentX("Top");
                doc.save("ex2.pdf");
               } catch (IOException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    });

    StackPane root = new StackPane();
    root.getChildren().addAll(pane);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Text to pdf example");
    primaryStage.setScene(scene);
    primaryStage.show();
}
public static void main(String[] args) {
    launch(args);
}

}


