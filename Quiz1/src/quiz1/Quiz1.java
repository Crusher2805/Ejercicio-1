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
        // Primero pedir al usuario la cantidad de empleados que va a ingresar y sus respectivos salarios, para que modele el for
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingresa la cantidad de empleados "));
        // luego pedir al usario usando la libreria JoptionPane los nombres de los empleados
        for (int i = 0; i < numeroEmpleados; i++) {
        // luego usar un for para las reiteraciones de las solicitudes de dichos datos
            String nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese su nombre ");
            double salarioEmpleado = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa tu salario"));
            // Luego realizar los respectivos calculos matematicos para calcular el salario final
            double calculo = (salarioEmpleado * 0.0925);
            double calculoV = (salarioEmpleado * 0.0508);
            double monto = (calculo + calculoV);
            double salarioFinal = (salarioEmpleado - monto);
            // Por ultimo mostrar los valores del calculo y el mensaje respectivo
            JOptionPane.showMessageDialog(null, " La empresa deberá abonar a la CCSS el monto de " + salarioFinal+ "por concepto de SEM y IVM");
        }
    }
}
