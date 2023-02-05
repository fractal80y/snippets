f = (str,...args)=> {
    console.log(args)
    console.log(str)
    for (let [i,val] of args.entries()){
        i++
        console.log(val)
        str= str.replace(('{'+`${i}`+'}'), val)
    }
    return str
}
