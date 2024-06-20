/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingresa la cantidad de empleados "));
        for (int i = 0; i < numeroEmpleados; i++) {
            String nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese su nombre ");
            double salarioEmpleado = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa tu salario"));
            double calculo = (salarioEmpleado * 0.0925);
            double calculoV = (salarioEmpleado * 0.0508);
            double monto = (calculo + calculoV);
            double salarioFinal = (salarioEmpleado - monto);
            JOptionPane.showMessageDialog(null, " La empresa deberá abonar a la CCSS el monto de " + salarioFinal+ "por concepto de SEM y IVM");
        }
    }
}
