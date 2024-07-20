package Ejercicio2;

import javax.swing.*;

public class MedicalAppointment {
    public int appointmentID;
    public String date;
    public String time;
    public String consultingname;
    public String doctorname;
    public String namepatient;
    private int privateMedicalCenter;

        public void createAppointment() {
            JOptionPane.showMessageDialog(null, "Welcome, please enter the appointment details you received in your email to schedule your appointment.");
            appointmentID = Integer.parseInt(JOptionPane.showInputDialog(null, "Appointment code:    "));
            namepatient = JOptionPane.showInputDialog(null, "Enter the name of patient: ");

            switch (appointmentID) {
                case 123:
                    date = "August/12/2025";
                    time = "4:00 pm";
                    consultingname = "A13";
                    doctorname = "jose";
                    JOptionPane.showMessageDialog(null, "Appointment created successfully");
                    break;

                case 431:
                    date = "september/11/2024";
                    time = "5:00 am";
                    consultingname = "B416";
                    doctorname = "Ana";
                    JOptionPane.showMessageDialog(null, "Appointment created successfully");
                    break;

                case 543:
                    date = "october/1/2023";
                    time = "2:00 pm";
                    consultingname = "C912";
                    doctorname = "Miguel";
                    JOptionPane.showMessageDialog(null, "Appointment created successfully");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "There are no avalible appointments at this moment, please try again tomorrow");
                    break;

            }

        }

    public void information(){
        if (date == null ) System.out.println("There are no appointment date");
        else JOptionPane.showMessageDialog(null,"Name patient: " + namepatient + "\nDoctor: " + doctorname + "\nConsulting name: " + consultingname + "\nDate: " + date + "\nTime: " + time);
    }

    public void confirmAppointment() {
            if (date == null ) System.out.println("There are no appointment date");
            else {
                int decision =  JOptionPane.showConfirmDialog(null,"Are you sure you want to schedule your appointment? \n " + "Appointment date: " + date + "\nTime: " + time );
                if (decision == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null,"Your date has been scheduled successfully");
                }
                if (decision == JOptionPane.NO_OPTION) {
                     int decision2 = JOptionPane.showConfirmDialog(null,"Do you want to change the appointment date?");
                     if (decision2 == JOptionPane.YES_OPTION) {
                         String change = JOptionPane.showInputDialog(null,"Enter a new appointment date: ");
                         date = change;
                         JOptionPane.showMessageDialog(null,"Appointment date has been changed successfully");
                         JOptionPane.showMessageDialog(null,"Name patient: " + namepatient + "\nDoctor: " + doctorname + "\nConsulting name: " + consultingname + "\nDate: " + date + "\nTime: " + time);
                     }
                     if (decision2 == JOptionPane.NO_OPTION) {
                         JOptionPane.showMessageDialog(null,"Appointment has ben canceleted successfully");
                     }
                }
            }
    }
}







