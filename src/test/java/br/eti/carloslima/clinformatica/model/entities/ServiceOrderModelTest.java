/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eduar
 */
public class ServiceOrderModelTest {
    
    public ServiceOrderModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumSerOrder method, of class ServiceOrderModel.
     */
    @Test
    public void testGetNumSerOrder() {
        System.out.println("getNumSerOrder");
        ServiceOrderModel instance = new ServiceOrderModel();
        Integer expResult = null;
        Integer result = instance.getNumSerOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumSerOrder method, of class ServiceOrderModel.
     */
    @Test
    public void testSetNumSerOrder() {
        System.out.println("setNumSerOrder");
        Integer numSerOrder = null;
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setNumSerOrder(numSerOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSerOrder method, of class ServiceOrderModel.
     */
    @Test
    public void testGetDataSerOrder() {
        System.out.println("getDataSerOrder");
        ServiceOrderModel instance = new ServiceOrderModel();
        LocalDate expResult = null;
        LocalDate result = instance.getDataSerOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSerOrder method, of class ServiceOrderModel.
     */
    @Test
    public void testSetDataSerOrder() {
        System.out.println("setDataSerOrder");
        LocalDate dataSerOrder = null;
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setDataSerOrder(dataSerOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class ServiceOrderModel.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ServiceOrderModel instance = new ServiceOrderModel();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class ServiceOrderModel.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamento method, of class ServiceOrderModel.
     */
    @Test
    public void testGetEquipamento() {
        System.out.println("getEquipamento");
        ServiceOrderModel instance = new ServiceOrderModel();
        String expResult = "";
        String result = instance.getEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamento method, of class ServiceOrderModel.
     */
    @Test
    public void testSetEquipamento() {
        System.out.println("setEquipamento");
        String equipamento = "";
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setEquipamento(equipamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefeito method, of class ServiceOrderModel.
     */
    @Test
    public void testGetDefeito() {
        System.out.println("getDefeito");
        ServiceOrderModel instance = new ServiceOrderModel();
        String expResult = "";
        String result = instance.getDefeito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefeito method, of class ServiceOrderModel.
     */
    @Test
    public void testSetDefeito() {
        System.out.println("setDefeito");
        String defeito = "";
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setDefeito(defeito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicoRealizado method, of class ServiceOrderModel.
     */
    @Test
    public void testGetServicoRealizado() {
        System.out.println("getServicoRealizado");
        ServiceOrderModel instance = new ServiceOrderModel();
        String expResult = "";
        String result = instance.getServicoRealizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicoRealizado method, of class ServiceOrderModel.
     */
    @Test
    public void testSetServicoRealizado() {
        System.out.println("setServicoRealizado");
        String servicoRealizado = "";
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setServicoRealizado(servicoRealizado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class ServiceOrderModel.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        ServiceOrderModel instance = new ServiceOrderModel();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class ServiceOrderModel.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        String value = "30.20";
        BigDecimal expResult = new BigDecimal(value);
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setValor(value);
        BigDecimal result = instance.getValor();
        System.out.println(result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCliente method, of class ServiceOrderModel.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ServiceOrderModel instance = new ServiceOrderModel();
        ClientModel expResult = null;
        ClientModel result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ServiceOrderModel.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        ClientModel cliente = null;
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class ServiceOrderModel.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        ServiceOrderModel instance = new ServiceOrderModel();
        UserModel expResult = null;
        UserModel result = instance.getTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class ServiceOrderModel.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        UserModel tecnico = null;
        ServiceOrderModel instance = new ServiceOrderModel();
        instance.setTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ServiceOrderModel.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ServiceOrderModel instance = new ServiceOrderModel();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ServiceOrderModel.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ServiceOrderModel instance = new ServiceOrderModel();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ServiceOrderModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ServiceOrderModel instance = new ServiceOrderModel();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
