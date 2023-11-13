class GymTrainer implements Trainer {
    protected String trainerName;

    public GymTrainer(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public void displayTrainerInfo() {
        System.out.println("Trainer: " + trainerName);
    }
}
