# Campus WiFi Access System

## Description
This program determines whether a user is allowed to access the **campus WiFi network** based on their user type and, for students, their number of credits taken.

The WiFi system follows these rules:
1. If the user type is **lecturer**, access is **granted**.
2. If the user type is **student**:
   - If credits ≥ 12 → **WiFi access granted (active student)**
   - If credits < 12 → **Access denied, credits less than 12**
3. If the user is neither a lecturer nor a student → **Access denied**

---

## Logic Table

 User Type  Credits  Output 

Lecturer  WiFi access granted (lecturer) 
Student ≥ 12  WiFi access granted (active student) 
Student  < 12  Access denied, credits less than 12 
Others  Access denied

---

##Pseudocode

BEGIN
    DECLARE userType AS STRING
    DECLARE credits AS INTEGER

    DISPLAY "Enter user type (lecturer/student/other): "
    INPUT userType

    IF userType == "lecturer" THEN
        DISPLAY "WiFi access granted (lecturer)"

    ELSE IF userType == "student" THEN
        DISPLAY "Enter number of credits taken: "
        INPUT credits

        IF credits >= 12 THEN
            DISPLAY "WiFi access granted (active student)"
        ELSE
            DISPLAY "Access denied, credits less than 12"
        ENDIF

    ELSE
        DISPLAY "Access denied"
    ENDIF
END



---

## Flowchart Overview

**Flowchart Steps:**
1. Start the program  
2. Input `userType`  
3. If `userType` is "lecturer" → **Display “WiFi access granted (lecturer)”**  
4. Else if `userType` is "student":  
   - Input `credits`  
   - If `credits ≥ 12` → **Display “WiFi access granted (active student)”**  
   - Else → **Display “Access denied, credits less than 12”**  
5. Else → **Display “Access denied”**  
6. End the program  

---

## Example Output

**Case 1 (Lecturer):**
Enter user type (lecturer/student/other): lecturer
WiFi access granted (lecturer)

**Case 2 (Student with 15 credits):**
Enter user type (lecturer/student/other): student
Enter number of credits taken: 15
WiFi access granted (active student)

**Case 3 (Student with 9 credits):**
Enter user type (lecturer/student/other): student
Enter number of credits taken: 9
Access denied, credits less than 12

**Case 4 (Guest user):**
Enter user type (lecturer/student/other): guest
Access denied


