# Jobsheet 5: Selection Statements

**Course:** Dasar Pemrograman 2025
**Institution:** Politeknik Negeri Malang
**Topic:** SELECTION (IF, IF–ELSE, SWITCH–CASE, Nested IF)

---

##  2.1 Experiment 1: Implementing IF and IF–ELSE to Print KRS

### Description

At the beginning of each semester, the system checks if the student has paid the **UKT (tuition fee)**.
If payment is completed, the system allows printing the **KRS (Kartu Rencana Studi)**.
Otherwise, printing is rejected.

### File

`ifCetakKRSNoPresensi.java`

### Logic

* Input: `true` / `false` (UKT payment status)
* Process:

  * If UKT is paid → display "KRS can be printed."
  * Else → display "Registration rejected. Please pay UKT first."
* Output: access permission message

### Example

```
Has the UKT been paid? (true/false): true
KRS can be printed.
```

---

##  2.2 Experiment 2: SWITCH–CASE for Printing KRS

### Description

The system checks which semester the student is in and displays the KRS for that semester.

### File

`switchCetakKRSNoPresensi.java`

### Logic

* Input: semester number (1–8)
* Process: display KRS for the selected semester
* Output: message with semester’s KRS

### Example

```
Enter your semester number: 3
KRS for Semester 3
```

### Notes

* `break` stops the program from executing the next case.
* `default` runs when no case matches.

---

##  2.3 Experiment 3: Nested IF to Check Thesis Examination Requirements

### Description

Before a student can register for a **thesis exam**, the system checks:

1. Administrative requirement — must be free from compensation.
2. Guidance logs:

   * Supervisor 1 → ≥ 8 sessions
   * Supervisor 2 → ≥ 4 sessions

If all requirements are met, the student is eligible for registration.

### File

`nestedUjianSkripsiNoPresensi.java`

### Logic

* Input:

  * Compensation status (`true` / `false`)
  * Guidance logs for Supervisor 1 & 2
* Process:

  * Check compensation first
  * If free → check both supervisors' logs
* Output: eligibility message

### Example

```
Is the student free from compensation? (true / false): true
Enter guidance log with Supervisor 1: 8
Enter guidance log with Supervisor 2: 4
All requirements met. Student may register for their thesis exam.
```

---

## Commit Messages

 Experiment  File Name                          Commit Message      

 2.1         ifCetakKRSNoPresensi.java          Test Modification 1 
 2.2         switchCetakKRSNoPresensi.java      Attempt 2           
 2.3         nestedUjianSkripsiNoPresensi.java  Attempt 3           




