import React from "react";
import BodyHorizontal from "./BodyHorizontal";
import BodyVertical from "./BodyVertical";

class Wrapper extends React.Component{
    getLayout=()=>{
        const  {layout} = this.props;

        switch(layout){
            case "1":
                return <BodyHorizontal/>;
            case "2":
                return <BodyVertical/>;
            default:
                return null;
        }
    };

    render(){
        const{layout} = this.props;
        console.log(layout);

        return <div>{layout === "1"?<BodyHorizontal/>:<BodyVertical/>}</div>;
    }
}

export default Wrapper;