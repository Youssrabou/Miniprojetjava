import Miniprojet.Collaborater;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static Miniprojet.Collaborater.*;
import static org.assertj.core.api.Assertions.*;

public class Testerminiprojet {


        @Test
        public void ShouldSetCollaborater1() {

        Collaborater collabotarer1  = new Collaborater ("508564","015512","0768861700","youssrabou@gmail.com");
        Collaborater collabotarer2  = new Collaborater ("508565","015513","0768861701","youssrabou1@gmail.com");
        Collaborater collabotarer3  = new Collaborater ("508566","015514","0768861702","youssrabou21@gmail.com");

        assertThat (collabotarer1.getColaboreterId ()).isEqualTo ("508564");
        }
    }




