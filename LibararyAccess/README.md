# Campus Library Entry System

## Description
This simple program determines whether a student is allowed to enter the campus library based on two conditions:
1. The student brings their **student ID**, or  
2. The student has **registered online**.

If neither condition is met, the student is **denied entry**.

---

## Logic Explanation
The system uses a logical **OR** condition:

>  If (studentID == "yes" OR registeredOnline == "yes") → **Allow Entry**  
>  Else → **Deny Entry**

--- 

## Pseudocode
BEGIN
    DECLARE studentID AS STRING
    DECLARE registeredOnline AS STRING

    DISPLAY "Do you have a student ID? (yes/no): "
    INPUT studentID

    DISPLAY "Have you registered online? (yes/no): "
    INPUT registeredOnline

    IF (studentID == "yes" OR registeredOnline == "yes") THEN
        DISPLAY "You are allowed to enter the library."
    ELSE
        DISPLAY "You are denied entry."
    ENDIF
END

---

##  Flowchart Overview

**Flowchart Steps:**
1. Start the program  
2. Ask the user if they have a student ID  
3. Ask if they have registered online  
4. Check the condition:
   - If either answer is **yes**, display "Allowed to enter"
   - Otherwise, display "Denied entry"  
5. End the program

**Decision Logic:**  

(hasStudentID == yes) OR (registeredOnline == yes)


---

## Example Output

**Case 1:**  

Do you have a student ID? (yes/no): yes
Have you registered online? (yes/no): no
You are allowed to enter the library.


**Case 2:** 
 
Do you have a student ID? (yes/no): no
Have you registered online? (yes/no): no
You are denied entry.




