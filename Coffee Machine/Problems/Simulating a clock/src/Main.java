class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes +=1;
        if(minutes ==60){
            hours+=1;
            minutes =0;
            if (hours ==13){
                hours =1;
            }
        }
    }
}