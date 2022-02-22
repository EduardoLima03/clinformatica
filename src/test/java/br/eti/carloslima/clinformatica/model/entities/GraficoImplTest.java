/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.entities;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.GraficoDao;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author eduar
 */
public class GraficoImplTest {

    public GraficoImplTest() {
    }
    
    private final GraficoDao dao = DaoFactory.createGraficoDao();
    
    @Test
    public void testTotalDeServicosConcluidoNoMes() {
        System.out.println("Test : Total de Serviços no mês");
        String[] argumentos ={"2022-02-01", "2022-02-28"};
        
        short expResult = 0;
        short result = dao.totalDeServicosConcluidoNoMes(argumentos);
        assertEquals(expResult, result);
    }
    
}
