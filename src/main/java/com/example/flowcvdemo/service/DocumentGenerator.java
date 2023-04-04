package com.example.flowcvdemo.service;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

@Service
public class DocumentGenerator {

    public String htmlToPdf(String processedHtml) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {

            PdfWriter pdfwriter = new PdfWriter(byteArrayOutputStream);

            DefaultFontProvider defaultFont = new DefaultFontProvider(false, true, false);

            ConverterProperties converterProperties = new ConverterProperties();

            converterProperties.setFontProvider(defaultFont);

            HtmlConverter.convertToPdf(processedHtml, pdfwriter, converterProperties);

            FileOutputStream fout = new FileOutputStream("./flow-cv-demo/files/employee.pdf");

            byteArrayOutputStream.writeTo(fout);
            byteArrayOutputStream.close();

            byteArrayOutputStream.flush();
            fout.close();

            return "Convert To Pdf";

        } catch(Exception ex) {
            ex.getMessage();
        }

        return "Idi nahui";
    }
}
//@RestController
//public class DemoDocument {
//
//    @Autowired
//    private DocumentGenerator documentGenerator;
//
//    @Autowired
//    private SpringTemplateEngine springTemplateEngine;
//
//    @Autowired
//    private DataMapper dataMapper;
//
//    @PostMapping(value = "/generate/document")
//    public String generateDocument(@RequestBody List<Employee> employeeList) {
//
//        String finalHtml = null;
//
//        Context dataContext = dataMapper.setData(employeeList);
//
//        finalHtml = springTemplateEngine.process("template", dataContext);
//
//        documentGenerator.htmlToPdf(finalHtml);
//
//        return "Success";
//    }
//}
