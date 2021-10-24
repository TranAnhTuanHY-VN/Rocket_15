import React from "react";
import Wrapper from "./Wrapper"

class Main extends React.Component{
    constructor(props){
        super(props);

        this.state = {
            display: "1"
        }

    }

    handleClick = (id) =>{
        this.setState({display:id});
    };

    render(){
        return (
            <main>
                <button onClick={()=> this.handleClick("1")}>Display way 1</button>
                <button onClick={()=> this.handleClick("2")}>Display way 2</button>

                <Wrapper layout={this.state.display}/>
            </main>
            );
        }
}

export default Main;