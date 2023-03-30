package ru.VolkovS.lessons.lesson6.Climbers;

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

    public int getSizeGroup() {
        return groupSize;
    }

    public boolean getgroupRecruitment() {
        return groupRecruitment;
    }

    public Climber[] getClimbers() {
        return climber;
    }

    public Mountains getMountain() {
        return mountains;
    }

    public void addClimber(Climber climber) {
        if (climber == null) {
            throw new IllegalArgumentException("Exception: Climber must be > 1");
        }
        if (this.groupRecruitment == true) {
            for (int i = 0; i < climber.length(); i++) {
                if (climber[i] == null) {
                    climber[i] = climber;
                    if (i == climber.length() - 1) setGroupRecruitment(false);
                    return;
                }
            }

        } else {
            setGroupRecruitment(false);
            System.out.println("Recruitment is over");
        }

    }
    public String getfullGroup() {
        return "Group " + this.groupRecruitment + ",Climber " + getClimbers() +
                ",mountain " +  /*????*/",groupSize " + groupSize + '}';
    }

}
