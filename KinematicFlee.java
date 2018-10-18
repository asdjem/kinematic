package movement;

import utils.Vec2f;

public class KinematicFlee extends KinematicMovement{
    
    @Override
    public KinematicOutput getSteering(){
        KinematicOutput steering = new KinematicOutput();
        steering.setVelocity(character.getPosition().sub(tagert.getPosition()));
        
        steering.getVelocity().normalize();
        steering.setVelocity(steering.getVelocity().multiconst(maxSpeed));
        
        character.setOrientation(character.getNewOriention(character.getOrientation(), steering.getVelocity()));
        
        steering.setRotation(0);
        return steering;
    }
    
}
