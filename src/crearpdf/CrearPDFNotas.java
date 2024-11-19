package crearpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;

public class CrearPDFNotas {
    public void añadirTexto() throws Exception {
        Document document = new Document();
        String parrafo = "Notas del Alumno "
                + "LM: _6 "
                + "BD: _5 "
                + "PROG: _6 "
                + "Ingles: _6 "
                + "ED: _5 ";
        PdfWriter.getInstance(document, new FileOutputStream("notas2.pdf"));
        document.open();
        document.add(new Paragraph(parrafo));
        document.close();
    }

    public static void main(String args[]) {
        try {
            CrearPDF p = new CrearPDF();
            p.añadirTexto();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}