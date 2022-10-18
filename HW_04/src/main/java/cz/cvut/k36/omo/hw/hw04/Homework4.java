package cz.cvut.k36.omo.hw.hw04;

public class Homework4 extends MessageVisitor  {
    public Homework4(Peer peer) {
        super(peer);
    }

    @Override
    public boolean visitHaveMessage(HaveMessage message) {
        // TODO
        return false;
    }

    @Override
    public boolean visitRequestMessage(RequestMessage message) {
        // TODO
        return false;
    }

    @Override
    public boolean visitPieceMessage(PieceMessage message) {
        // TODO
        return false;
    }

    @Override
    public boolean visitIdleMessage(IdleMessage message) {
        // TODO
        return false;
    }

}
