package cafe.adriel.bonsai.sample.tree

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.bonsai.core.Bonsai
import cafe.adriel.bonsai.core.BonsaiStyle
import cafe.adriel.bonsai.core.node.Branch
import cafe.adriel.bonsai.core.node.Leaf
import cafe.adriel.bonsai.core.tree.Tree

@Composable
fun composeTree(): Tree<String> =
    Tree {
        Branch("Animalia") {
            Branch("Chordata") {
                Branch("Mammalia") {
                    Branch("Carnivora") {
                        Branch("Canidae") {
                            Branch("Canis") {
                                Leaf("Wolf")
                                Leaf("Dog")
                            }
                        }
                        Branch("Felidae") {
                            Branch("Felis") {
                                Leaf("Cat")
                            }
                            Branch("Panthera") {
                                Leaf("Lion")
                            }
                        }
                    }
                }
            }
        }
        Branch("Plantae") {
            Branch("Solanales") {
                Branch("Convolvulaceae") {
                    Branch("Ipomoea") {
                        Leaf("Sweet Potato")
                    }
                }
                Branch("Solanaceae") {
                    Leaf("Potato")
                    Leaf("Tomato")
                }
            }
        }
    }

@Composable
fun BonsaiContent(
    tree: Tree<String>,
    modifier: Modifier = Modifier
) {
    Bonsai(
        tree = tree,
        style = BonsaiStyle(
            nodeNameStartPadding = 4.dp
        ),
        modifier = modifier
    )
}
