package ru.VolkovS.lessons.lesson6.Climbers;

import java.util.Arrays;

public class Group {

    private boolean groupRecruitment;
    private Mountains mountains;
    public int groupSize;
    private Climber[] climbers;

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
        this.climbers = new Climber[groupSize];
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
        return climbers;
    }

    public Mountains getMountain() {
        return mountains;
    }

    public void addClimber(Climber climber) {
        if (climber == null) {
            throw new IllegalArgumentException("Exception: Climber must be > 1");
        }
        if (this.groupRecruitment) {

            for (int i = 0; i < this.climbers.length; i++) {
                if (this.climbers[i] == null) {
                    this.climbers[i] = climber;

                    if (i == this.climbers.length - 1) setGroupRecruitment(false);
                    return;
                }
            }

        } else {
            setGroupRecruitment(false);

            System.out.println("Recruitment is over");
        }

    }

    public String over() {
        return "The group consists of:";
    }

    public String fullGroup() {
        return  over() + " Climber " + Arrays.toString(climbers) +
                " ,mountain " + mountains.fullNameM() + " ,groupSize " + groupSize + '}';
    }

}
