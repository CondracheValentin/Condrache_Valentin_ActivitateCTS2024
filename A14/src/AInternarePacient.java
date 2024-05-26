public abstract class AInternarePacient {
        abstract void analizeazaStare();
        abstract void verificaDisponibilateSalon();
        abstract void emiteFisa();

        public final void internarePacient(){
                analizeazaStare();
                verificaDisponibilateSalon();
                emiteFisa();
        }

}
