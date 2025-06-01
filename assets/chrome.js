// Inspiration via: http://davidwalsh.name/css-animation-callback
var addAnimationEndEvent = function(el, fn) {
  var t;
  var animations = {
    'animation'       : 'animationend',
    'OAnimation'      : 'oAnimationEnd',
    'MozAnimation'    : 'animationend',
    'WebkitAnimation' : 'webkitAnimationEnd'
  };

  for (t in animations) {
    if ( typeof el.style[t] !== 'undefined' ) {
      el.addEventListener(animations[t], fn);
      return true;
    }
  }
  return false;
};

var removeAnimationEndEvent = function(el, fn) {
  var t;
  var animations = {
    'animation'       : 'animationend',
    'OAnimation'      : 'oAnimationEnd',
    'MozAnimation'    : 'animationend',
    'WebkitAnimation' : 'webkitAnimationEnd'
  };

  for (t in animations) {
    if ( typeof el.style[t] !== 'undefined' ) {
      el.removeEventListener(animations[t], fn);
      return true;
    }
  }
  return false;
};

var addTransitionEndEvent = function(el, fn) {
  var t;
  var transitions = {
    'transition'       : 'transitionend',
    'OTransition'      : 'oTransitionEnd',
    'MozTransition'    : 'transitionend',
    'WebkitTransition' : 'webkitTransitionEnd'
  };

  for (t in transitions) {
    if ( typeof el.style[t] !== 'undefined' ) {
      el.addEventListener(transitions[t], fn);
      return true;
    }
  }
  return false;
};

var removeTransitionEndEvent = function(el, fn) {
  var t;
  var transitions = {
    'transition'       : 'transitionend',
    'OTransition'      : 'oTransitionEnd',
    'MozTransition'    : 'transitionend',
    'WebkitTransition' : 'webkitTransitionEnd'
  };

  for (t in transitions) {
    if ( typeof el.style[t] !== 'undefined' ) {
      el.removeEventListener(transitions[t], fn);
      return true;
    }
  }
  return false;
};
