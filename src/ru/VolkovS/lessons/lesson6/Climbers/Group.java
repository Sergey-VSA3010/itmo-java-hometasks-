package ru.VolkovS.lessons.lesson6.Climbers;
import java.util.Arrays;

public class Group {

    private boolean groupRecruitment;
    private Mountains mountains;
    public int groupSize;
    private Climber[] climber;
    public Group(boolean groupRecruitment, Mountains mountains, int groupSize) {
        setGroupRecruitment(groupRecruitment);
        setMountain(mountains);
        setGroupSize(groupSize);
        setClimber(groupSize);
    }

    public void setGroupSize(int groupSize) {
        if (groupSize < 1) {
            throw new IllegalArgumentException("Exception: groupSize < 1");
        }
        this.groupSize = groupSize;
    }

    public void setGroupRecruitment(boolean groupRecruitment) {
        this.groupRecruitment = groupRecruitment;
    }

    public void setClimber(int groupSize) {
        if (groupSize < 1) {
            throw new IllegalArgumentException("Exception: groupSize < 1");

        }
        this.climber = new Climber[groupSize];
    }

    public void setMountain(Mountains mountain) {
        if (mountain == null) {
            throw new IllegalArgumentException("Exception: mountain == null");
        }
        this.mountains = mountain;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public boolean getGroupRecruitment() {
        return groupRecruitment;
    }

    public Climber[] getClimber() {
        return climber;
    }

    public Mountains getMountain() {
        return mountains;
    }

    public void addClimber(Climber climber) {
        if (climber == null) {
            throw new IllegalArgumentException("Exception: Climber must be > 1");
        }
        if (groupRecruitment == true) {

            for (int i = 0; i < climber.length; i++) {
                if (climber[i] == null) {
                    climber[i] = climber;

                    if (i == climber.length - 1) setGroupRecruitment(false);
                    return;
                }
            }

        } else {
            setGroupRecruitment(false);
            System.out.println("Recruitment is over");
        }

    }

    public String getfullGroup() {
        return "Group{" + groupRecruitment + ",Climber " + climber +
                ",mountain " +  mountains + ",groupSize " + groupSize + '}';
    }

}
