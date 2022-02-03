/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.entities;

import java.util.List;
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
public class UserModelTest {
    
    public UserModelTest() {
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
     * Test of getUserName method, of class UserModel.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        UserModel instance = new UserModel();
        instance.setUserName("Eduardo");
        String expResult = "Eduardo";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class UserModel.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "Eduardo";
        UserModel instance = new UserModel();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class UserModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserModel instance = new UserModel();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UserModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserModel instance = new UserModel();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerfil method, of class UserModel.
     */
    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        UserModel instance = new UserModel();
        int expResult = 0;
        int result = instance.getPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfil method, of class UserModel.
     */
    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        int perfil = 0;
        UserModel instance = new UserModel();
        instance.setPerfil(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManuntecoes method, of class UserModel.
     */
    @Test
    public void testGetManuntecoes() {
        System.out.println("getManuntecoes");
        UserModel instance = new UserModel();
        List<ServiceOrderModel> expResult = null;
        List<ServiceOrderModel> result = instance.getManuntecoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManuntecoes method, of class UserModel.
     */
    @Test
    public void testSetManuntecoes() {
        System.out.println("setManuntecoes");
        ServiceOrderModel manuntecoes = null;
        UserModel instance = new UserModel();
        instance.setManuntecoes(manuntecoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserModel.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserModel instance = new UserModel();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserModel.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
