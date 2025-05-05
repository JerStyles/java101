package lesson1;

import lesson1.*;

public class Student {
    private String name;
    private int scoreMath;
    private int scoreBiology;

    public Student(String teacher, String student, int scoreMath, int scoreBiology) {
        
        this.setName(student);
        this.setScoreMath(scoreMath);
        this.setScoreBiology(scoreBiology);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoreMath() {
        return this.scoreMath;
    }

    public int getScoreBiology() {
        return this.scoreBiology;
    }

    public void setScoreMath(int score) {
        if (score >= 0 && score <= 100) {
            this.scoreMath = score;
        } else {
            System.out.println("分數需在 0 ~ 100 之間");
        }
    }

    public void setScoreBiology(int score) {
        if (score >= 0 && score <= 100) {
            this.scoreBiology = score;
        } else {
            System.out.println("分數需在 0 ~ 100 之間");
        }
    }
}
