/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.pdf;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ImpressaoImpl implements Impressao{

    @Override
    public void orcamento() {
        String path = "D:\\eduar\\Workspace\\Java\\itextTeste\\pdf\\Invoice.pdf";
        PdfWriter pdfWriter;
        try {
            pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);
        //tamanho da folha
        pdfDocument.setDefaultPageSize(PageSize.A4);

        DeviceRgb backgorundColor = new DeviceRgb(63, 169, 219);

        // Cabecario
        float col = 280f;
        float columnWidth[] = {col, col};

        Table table = new Table(columnWidth);
        Paragraph p = new Paragraph("ENVOICE");

        table.setBackgroundColor(backgorundColor)
                .setFontColor(new DeviceRgb(255, 255, 255));
        table.addCell(new Cell().add(p)
                .setTextAlignment(TextAlignment.CENTER)
                .setVerticalAlignment(VerticalAlignment.MIDDLE)
                .setMarginTop(30f)
                .setMarginBottom(col)
                .setFontSize(30f)
                .setBorder(Border.NO_BORDER)
        );
        table.addCell(new Cell().add(new Paragraph("Hospital de Tal\n"
                + "(00) 90000-0000\nRua sem nome, 01, Bairro - Cidade, estado\n"
                + "CNPJ: 00.000.000/0000-00"))
                .setTextAlignment(TextAlignment.LEFT)
                .setMarginTop(30f)
                .setMarginBottom(30f)
                .setBorder(Border.NO_BORDER)//remove a  borda da celula
                .setMarginRight(10f)
                .setFontSize(14f)
        );

        //Tabela Criente
        float col2 = 100f;
        float col3 = 460f;
        float columnTable[] = {col2, col3};
        Table tableCriente = new Table(columnTable);
        //Linha 1 Data
        tableCriente.addCell(new Cell().add(new Paragraph("Data:"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        tableCriente.addCell(new Cell().add(new Paragraph(" ____/____/_______")));

        //Linha 2
        tableCriente.addCell(new Cell().add(new Paragraph("Criente:"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        tableCriente.addCell(new Cell().add(new Paragraph())
        );

        //Linha 3
        tableCriente.addCell(new Cell().add(new Paragraph("Telefone:"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        tableCriente.addCell(new Cell().add(new Paragraph()));

        //Linha 4
        tableCriente.addCell(new Cell().add(new Paragraph("Endereço:"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        tableCriente.addCell(new Cell().add(new Paragraph()));

        //Linha 5
        tableCriente.addCell(new Cell().add(new Paragraph("Equipamento:"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        tableCriente.addCell(new Cell().add(new Paragraph()));

        //Titulo
        Table tableTitle = new Table(columnWidth);
        tableTitle.addCell(new Cell(0, 2).add(new Paragraph("Orçamento de Produtos e Serviços"))
                .setFontColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
                .setFontSize(16f)
                .setBorder(Border.NO_BORDER)
        );

        //Lista de orçamento
        float[] colLista = {112f, 112f, 112f, 112f, 112f};
        Table tableLista = new Table(colLista);
        tableLista.addCell(new Cell().add(new Paragraph("Quantidade"))
                .setBackgroundColor(backgorundColor)
        );
        tableLista.addCell(new Cell(0, 2).add(new Paragraph("Descrição"))
                .setBackgroundColor(backgorundColor)
        );
        tableLista.addCell(new Cell().add(new Paragraph("Valor"))
                .setBackgroundColor(backgorundColor)
        );
        tableLista.addCell(new Cell().add(new Paragraph("Valor Total"))
                .setBackgroundColor(backgorundColor)
        );
        /*
            As linhas desa table deve ser gerada pela quantidade itens na lista
            laco For
        */
        //Linha 1
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell(0, 2).add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        //Linha 2
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell(0, 2).add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        //Linha 3
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell(0, 2).add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        tableLista.addCell(new Cell().add(new Paragraph())
        );
        //*****
        //total
        tableLista.addCell(new Cell().add(new Paragraph())
                .setBorder(Border.NO_BORDER)
        );
        tableLista.addCell(new Cell(0, 2).add(new Paragraph())
                .setBorder(Border.NO_BORDER)
        );
        tableLista.addCell(new Cell().add(new Paragraph("Total"))
        );
        tableLista.addCell(new Cell().add(new Paragraph("R$"))
        );
        
        //Adicionais
        Table TableAdicionais = new Table(columnWidth);
        TableAdicionais.addCell(new Cell(0,2).add(new Paragraph("Informações Adicionais"))
                .setBackgroundColor(backgorundColor)
                .setTextAlignment(TextAlignment.CENTER)
        );
        TableAdicionais.addCell(new Cell(0,2).add(new Paragraph("Forma de Pagamento: Á vista ou parcelado em ate 12 sem juros no cartão de crédito. \n" +
"Orçamento valido por 10 dias após a data de emissão com forme o art. 40 da Lei n° 8.078 de 11 de setembro de 1990 - CDC")));

        document.add(table);//cabecario
        document.add(tableCriente);
        document.add(tableTitle);
        document.add(tableLista);
        document.add(new Paragraph("\n \n"));
        document.add(TableAdicionais);

        document.close();
        } catch (FileNotFoundException ex) {
            throw new ImpressaoExeception(ex.getMessage());
        }
        
    }

    @Override
    public void garantia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordemDeServico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
