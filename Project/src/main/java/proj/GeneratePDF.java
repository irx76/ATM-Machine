/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

/**
 *
 * @author irosh
 */
public class GeneratePDF {
    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\irosh\\OneDrive\\Desktop\\doc.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document=new Document(pdfDocument);
        
        document.add(new Paragraph("Hello "));
        document.close();
        System.out.println("Doc created");
    }
    
}
