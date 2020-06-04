# Autor: velkysargel@hotmail.com

@Historia
 Feature: Gestionar Cita Médica
    Como paciente
    Quiero realizar la solicitud de una cita médica
    A través del sistema de Administración de Hospitales

  #@Escenario1
   #Scenario: Realizar el Registro de un Doctor
    #Given que Carlos necesita registrar un nuevo doctor
   #When el realiza el registro del mismo en el aplicativo de Administración de Hospitales
    #|nombre|apellido |telefono|tipoDocumento           |documentoIdentidad     |
   #|Carmen|Rodriguez|1456788 |Cédula de ciudadanía    |78456878               |
    #Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

    #@Escenario2
    #Scenario: Realizar el Registro de un Paciente
    #Given que Carlos necesita registrar un nuevo paciente
    #When el realiza el registro del mismo en el aplicativo de Administración del Hospital
    #|nombre|apellido |telefono|tipoDocumento|documentoIdentidad     |
    #|Sara  |Campos   |69584578|Pasaportes   |78456780               |
    #Then el verifica que se presente en la pantalla el mensaje Datos guardados correctamente.

    @Escenario3
    Scenario: Realizar el Agendamiento de una Cita
    Given que Carlos necesita asistir al medico
    When el realiza el agendamiento de una Cita
    |diaCita   |documentoIdentidadPaciente|documentoIdentidadDoctor|observaciones        |
    |07/12/2020|58745623                  |78945612                |Cita Medicina General|
    Then el verifica se presente en pantalla el mensaje Datos guardados correctamente.


