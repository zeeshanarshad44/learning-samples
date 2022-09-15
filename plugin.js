<script type="text/javascript">
/**
 * Attach an event handler on a given Node taking care of Browsers Differences
 * @param {Object} node
 * @param {String} type
 * @param {Function} fn
 * @param {Boolean} capture
 */
function addEventHandler(node,type,fn , capture){
       if(typeof window.event !== "undefined"){
                /* Internet Explorer way */
               node.attachEvent( "on" + type, fn );
       } else {
               /* FF & Other Browsers */
               node.addEventListener( type, fn , capture );
       }
}

/* Example */
addEventHandler(window,"load",function(){
   alert("The page was loaded");
},true)
</script>
